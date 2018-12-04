/**
 * Created by 96274 on 2018/11/20.
 */
public class fastSortTest {

    public static void quickSort(int a[], int left ,int right){
        System.out.println("left="+left+",right="+right);
        int mid ;
        mid = (left+right)/2;
        if(left>=right)
            return;
        if(a.length<=0){
            return;
        }
        int midValue = a[mid];
        int i = left;
        int j = right;
        while (i<j){
            while(a[i]<= midValue && i<mid){
                i++;
            }
            while (a[j]>= midValue && j>mid){
                j--;
            }
            if(i==j){
                break;
            }else if(i!=mid && j!=mid){
                swap(a,i,j);
            }else if(i == mid){
                swap(a,mid,mid+1);
                mid= mid+1;
            }else if(j == mid){
                swap(a,mid,mid-1);
                mid= mid-1;
            }
        }
        quickSort(a,left,mid-1);
        quickSort(a,mid+1,right);
    }

    public static void swap(int a[],int n1,int n2){
        int t = a[n1];
        a[n1] = a[n2];
        a[n2] = t;
    }

    public static void main(String[] args){
        int a[] = {1,3,0,0,0, 0,0,0,0,0};
        //模拟快排过程
        //第一次后： 1 3 0 2 1    4     9 8 6 5
        //第二次后： 0 1 1 2 3    4     5 6 8 9
        quickSort(a,0,a.length-1);
        for(int i = 0 ; i< a.length; i++){
            System.out.print(" "+a[i]);
        }
    }
}
