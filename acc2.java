import java.util.*;
public class acc2 {
    public static int[] solve(int v, int w){
        if(w< 2*v || (w-2*v)%2!=0){
            return null;
        }
        int fw = (w-2*v)/2;
        int tw = v-fw;
        return new int[] {tw, fw};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, w;
        v = sc.nextInt();
        w = sc.nextInt();
        int result[] = solve(v, w);
        if(result == null){
            System.out.println("invalid input");
        }
        else{
            System.out.println("TW = "+ result[0]);
            System.out.println("FW = "+ result[1]);
        }
    }
}
