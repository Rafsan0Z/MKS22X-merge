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
  elfe if(data.length == 2){
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
  merge(data,lo,point,hi);
}
}

public static void merge(int[] data, int lo, int point, int hi){
  for(int i = lo, j = point; point < hi){
    if()
  }
}

public static void mergesort(int[] data, int[] temp, int lo, int hi){

}

public static void main(String[] args){

}



}
