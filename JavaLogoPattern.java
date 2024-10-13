// package javaPattern;

public class JavaLogoPattern {

    static String c1="\033[38;5;202m";
    static String r="\033[0m";

    public static void main(String[] args) {
        for (int i = 1; i <=190; i++) {
            for (int j = 1; j <= 401; j++) {

                if((i==8 && j==224)
                
                ||(i==9 && (j>=225 && j<=226))
                ||(i==10 && (j>=226 && j<=229))
                ||(i==11 && (j>=226 && j<=230))
                ||(i==12 && (j>=227 && j<=231))
                ||(i==13 && (j>=227 && j<=232))
                



                
                
                ){
                    System.out.print(c1+"*"+r);
                }else{

                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    
}
