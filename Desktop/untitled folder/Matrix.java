package Matrix;
import java.util.Scanner;

public class Matrix {
    private final int SIZE=20;
    private int[][] a;
    private int soHang;
    private int soCot;

    public Matrix() {
        this.a = new int[SIZE][SIZE];
    }

    public void insertMatrix(){
        Scanner t=new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc ma tran:");
            System.out.println("So hang:");
            soHang= t.nextInt();
            System.out.println("So cot:");
            soCot=t.nextInt();
            if(soHang<2 || soHang>SIZE || soCot<2 || soCot>SIZE){
                System.out.println("Kich thuoc khong phu hop! Hay nhap lai:");
            }
        } while (soHang<2 || soHang>SIZE || soCot<2 || soCot>SIZE);

        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i=0; i<soHang; i++){
            for (int j=0; j<soCot; j++){
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=t.nextInt();
            }
        }
    }

    public void displayMatrix(){
        for (int i=0; i<soHang; i++){
            System.out.println();
            for (int j=0; j<soCot; j++){
                System.out.print(a[i][j]+"    ");
            }
        }
    }

    public void sortMatrix(){
        for(int i=0; i<soHang;i++){
            for (int j=0;j<soCot;j++){
                for (int m=0;m<soHang;m++){
                    for (int n=0;n<soCot;n++){
                        if(a[i][j]<a[m][n]){
                            //swap(a[i][j], a[m][n])
                            a[i][j]=a[i][j]+a[m][n];
                            a[m][n]=a[i][j]-a[m][n];
                            a[i][j]=a[i][j]-a[m][n];
                        }
                    }
                }
            }
        }
    }

    public void displayNumOfNegativeNumber(){
        int count=0;
        for(int i=0;i<soHang;i++){
            for (int j=0; j<soCot; j++){
                if(a[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("So phan tu am trong ma tran: "+count);
    }

    public void displayNumOfNegativeNumber2(){
        int count=0;
        int i=0;
        int j=soCot-1;
        while(j>0 && i<soHang){
            if(a[i][j]<0){
                count += (j+1);
                i++;
            }
            else{
                j-=1;
            }
        }
        System.out.println("So phan tu am trong ma tran: "+count);
    }
}
