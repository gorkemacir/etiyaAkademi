public class Main {
    public static void main(String[] args) {
        String [][] sehirler = new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][0]="Bursa";
        sehirler[0][0]="Bilecik";
        sehirler[0][0]="Ankara";
        sehirler[0][0]="Konya";
        sehirler[0][0]="Kayseri";
        sehirler[0][0]="Diyarbakır";
        sehirler[0][0]="Şanlıurfa";
        sehirler[0][0]="Gaziantep";

        for (int i=0; i<=2; i++){
            System.out.println("-----------------");
            for (int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}