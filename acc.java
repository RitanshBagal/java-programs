import java.util.*;
public class acc{
    public static int solve(int r, int u, int n, int arr[]){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int foodReq =r*u;

        if(arr == null){
            return -1;
        }
        for(int i =0; i<n; i++){
            sum+=arr[i];
            if(sum>=foodReq){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,u,n;
        r= sc.nextInt();
        u= sc.nextInt();
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\n"+"ans= "+solve(r, u, n, arr));
    }
}