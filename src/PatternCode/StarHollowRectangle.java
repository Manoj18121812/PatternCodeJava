package PatternCode;

public class StarHollowRectangle {
    public static void main(String[] args) {

        for(int j=1;j<=5;j++){
            for(int l=1;l<=5;l++){
                if(j==1 || j==5 || l==1 || l==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
