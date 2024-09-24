import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();

        if(0<=h&h<=23){
            if(0<=m&m<=59){
                if(0<=s&s<=59){
                    if(0<=t&t<=1000000000){

                        s += t;
                        int i= 0;
                        while(s>=60){
                            s-=60;
                            i++;
                        }

                        m += i;
                        int k = 0;
                        while(m>=60){
                            m-=60;
                            k++;
                        }

                        h += k;
                        int l = 0;
                        while(h>=24){
                            h -= 24;
                        }

                        System.out.printf("%d\n", h);
                        System.out.printf("%d\n", m);
                        System.out.printf("%d\n", s);

                    }
                }
            }
        }
    }
}
