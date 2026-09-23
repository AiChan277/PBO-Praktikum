public class main {
    public static void main(String[] args){
        Vector2 fatisda = new Vector2(-7.558425851778367, 110.8579537110799);
        Vector2 priaSolo = new Vector2(-7.5510663174747785, 110.80697667092481);

        System.out.println("Distance between fatisda and priaSolo: " + fatisda.distance(priaSolo));

        Entitas an225 = new Entitas("AN-225", 0.02, true);
        an225.point = new Vector3(-7.900291790743532, 110.04354004784452, 0);

        Entitas an226 = new Entitas("AN-226", 0.02, true);
        an226.point = new Vector3(-7.910206182437049, 110.07062528780817, 0);

        System.out.println("Distance between " + an225.nama + " and " + an226.nama + ": "
                + an225.point.distance(an226.point));
        System.out.println("Are " + an225.nama + " and " + an226.nama + " colliding? "
                + an225.isColliding(an226));
    }
}
