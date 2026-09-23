public class Entitas {
    Vector2 point;
    String nama;
    double radius;

    public Entitas(String nama, double radius, boolean is3D) {
        this.nama = nama;
        this.radius = radius;
        this.point = (is3D)? new Vector3() : new Vector2();
    }

    // Membuat method untuk mengecek apakah dua objek bertabrakan.
    public boolean isColliding(Entitas e) {
        boolean is3D = this.point instanceof Vector3;
        boolean else3D = e.point instanceof Vector3;

        // Objek dari dimensi berbeda tidak dibandingkan untuk tabrakan.
        if (is3D != else3D) {
            return false;
        }

        double fromCentre = this.point.distance(e.point);
        double minDistance = this.radius + e.radius;

        return fromCentre <= minDistance;
    }
}
