import java.util.*;
public class Task02{
    static int efficientJanitor(float weight[]){
        Arrays.sort(weight);
        int trips = 0;
        int i=0;
        int j=weight.length-1;
        while(i<j){
            if(weight[i]+weight[j]<=3.0){
                trips++;
                i++;
                j--;
            }
            else{
                trips++;
                j--;
            }
        }
        if(i==j){
            trips++;
        }
        return trips;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float weight[] = new float [sc.nextInt()];
        for(int i=0; i<weight.length; i++){
            weight[i]=sc.nextFloat();
        }
        System.out.println(efficientJanitor(weight));
    }
}