public class AsalSayiBul {
    public static void main(String[] args) {
        boolean asalMi=true;

        for(int i=2;i<=100;i++){
            asalMi=true;
            for(int t=i-1;t>1;t--){
                if(i%t==0){
                    asalMi=false;
                    break;
                }
            }

            if(asalMi==true){
                System.out.print(i + " ");
            }else{
                // System.out.println(i + "Meh"); Test etmek icin
            }
        }

    }
}
