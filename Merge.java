public class Merge{

public static void mergesort(int[] data){

}

public static void mergesort(int[] data, int lo, int hi){
  if(lo >= hi){return;}
  int point = (lo+hi)/2;
  mergesort(data,lo,point);
  mergesort(data,point+1,hi);
  merge(data,lo,point,hi);
}

public static void merge(int[] data, int lo, int point, int hi){
  
}

public static void main(String[] args){

}



}
