public class Merge{

public static void mergesort(int[] data){
  if(data.length <= 1){return;}
  mergesort(data,0,data.length-1);
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

public static void mergesort(int[] data, int lo, int hi){
  if(lo >= hi){return;}
  else if(data.length < 2){return;}
  else if(data.length == 2){
    if(data[0] <= data[1]){return;}
    else{
      exchange(0,1,data);
      return;
    }
  }
  else{
  int point = (lo+hi)/2;
  mergesort(data,lo,point);
  mergesort(data,point+1,hi);
  data = merge(data,lo,point,hi);
}
}

public static int[] merge(int[] data, int lo, int point, int hi){
  int[] result = new int[data.length];
  int index = 0;
  for(int i = lo, j = point; i < point && j < hi; i = j+1, i++){
    if(data[i] <= data[j]){
      result[index] = data[i];
      index++;
    }
    else{
      result[index] = data[j];
      index++;
    }
  }
  return result;
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
  int[] data = new int[] {8,6,7,5,3,0,9,10,21,2,14,4,5,2,7,9,12,6};
  System.out.println(printArray(data));
  mergesort(data);
  System.out.println(printArray(data));

}



}
