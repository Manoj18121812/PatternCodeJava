package PatternCode;

public class StartTriangleFull {

    public static void main(String[] args){

        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=4;k>=1;k--){
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
