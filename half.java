import java.util.Scanner;

/**
 * Created by 96274 on 2018/11/18.
 */
public class half {

    //递归
    public static int binarySearch(int t , int left, int right,int a[]){
        //System.out.println("left="+left+",right="+right);
        if(a.length<=0 ||t>a[right] || t< a[left] ){
            return -1;
        }
        if(left<=right){
            int mid = (left+right)/2;
            if(a[mid] == t)
                return mid;
            if(t>a[mid]){
                return binarySearch(t,mid+1,right,a);
            }else{
                return binarySearch(t,left,mid-1,a);
            }
        }
        return -1;
    }

    //非递归
    public static int binarySearch(int t ,int a[]){
        int left = 0,right = a.length-1;
        if(a.length<=0||t>a[right] || t< a[left]){
            return -1;
        }
        while(left<=right){
            int mid = (left+right)/2;
            if(a[mid] == t)
                return mid;
            if(t>a[mid]){
                left = mid+1;
            }else{
               right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int a[] = {1,2,3,3,5,6,7,8,9,19,20};
        int t ;
        while(true){
            Scanner sc = new Scanner(System.in);
            t = sc.nextInt();
            int x = binarySearch(t,a);//binarySearch(t,0,(a.length-1),a);
            if(x ==-1){
                System.out.println("不存在！");
            }else {
                System.out.println("它在数组中的下标为："+x);
            }

        }
    }
}
