public class Merge{

public static void mergesort(int[] data){
  if(data.length <= 1){return;}
  mergesortHelper(data,0,data.length-1);
}

public static void Mergesort(int[] data){
  int[] temp = copy(data);
  mergesort(data,temp,0,data.length-1);
}

public static int[] copy(int[] data){
  int[] result = new int[data.length];
  for(int i = 0; i < data.length; i++){
    result[i] = data[i];
  }
  return result;
}

public static void mergesortHelper(int[] data, int lo, int hi){
  if(lo >= hi){return;}
  else if(hi-lo+1 == 2){
    if(data[0] <= data[1]){return;}
    else{
      exchange(0,1,data);
      return;
    }
  }
  int point = (lo+hi)/2;
  mergesortHelper(data,lo,point);
  mergesortHelper(data,point+1,hi);
  data = merge(data,lo,point,hi);
}

public static int[] merge(int[] data, int lo, int point, int hi){
  int[] a = new int[point-lo+1];
  int[] b = new int[hi-point+1];
  for(int i = 0; i < a.length; i++){
    a[i] = data[lo+i];
  }
  for(int j = 0; j < b.length; j++){
    b[j] = data[point+1+j];
  }

}

public static void insertionSort(int[] ary, int lo, int hi) {
  for(int i = lo; i < hi+1; i++) {
    int current = ary[i];
    int place = i;
    while(place != 0 && ary[place - 1] > current) {
      ary[place] = ary[place - 1];
      ary[place - 1] = current;
      place--;
    }
  }
}

public static void mergesort(int[] data, int[] temp, int lo, int hi){

}

public static void exchange(int num1, int num2, int[] data){ // these are indices
  int temp = data[num1];
  data[num1] = data[num2];
  data[num2] = temp;
}

public static String printArray(int[] ary) {
String result = "[";
for (int i = 0; i < ary.length ; i++) {
result += " " + ary[i];
if (i != ary.length - 1) {
  result += ",";
}
}
return result + "]";
}

public static void main(String[] args){
  int[] data = new int[] {8,6,7,5,3};
  System.out.println(printArray(data));
  mergesort(data);
  System.out.println(printArray(data));

}



}
