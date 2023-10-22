package day01;
import java.util.Scanner;
public class CiftToplam {
    public static void main(String[] args) {

        int sayi,toplam=0,sayac=0;
        double ortalama;
        Scanner input=new Scanner(System.in);

        System.out.println("sayi giriniz: ");
        sayi=input.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                sayac++;
                toplam+=i;
            }
        }

        if(sayac>0){
            ortalama=(double) toplam/sayac;
            System.out.println("ortalama: "+ortalama);
        }else {
            System.out.println("3 e ve 4 e bölünen sayı bulunamadı.");
        }
    }
}
