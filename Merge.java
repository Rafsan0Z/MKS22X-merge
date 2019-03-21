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
    if(data[lo] <= data[hi]){return;}
    else{
      exchange(hi,lo,data);
      return;
    }
  }
  int point = (lo+hi)/2;
  mergesortHelper(data,lo,point);
  mergesortHelper(data,point,hi);
  //merge(data,lo,point,hi);
}

public static void merge(int[] data, int lo, int point, int hi){
  int counter = point+1;
  int compare = counter;
  int stop = counter;
  int index = lo;
  while(counter < hi){
    for(int i = lo; i < stop; i++){
      if(data[i] > data[counter]){
        exchange(counter,i,data);
        stop++;
        counter++;
        compare++;
        i = stop;
      }
    }
    if(compare == counter){
      counter++;
      compare++;
    }
  }
  /*while(counter < hi && index < stop){
    if(data[index] > data[counter]){
      exchange(counter,index,data);
      stop++;
      counter++;
      index = lo;
    }
    index++;
  }*/
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
  if(hi == lo){return;}
  int point = (hi+lo)/2;
  for(int i = lo; i <= hi; i++){
    temp[i] = data[i];
  }
  mergesort(data,temp,lo,point);
  mergesort(data,temp,point+1,hi);
  merge(data,temp,lo,point,point+1,hi);
}

public static boolean check(int[] temp, int lo, int point, int point2, int hi){
  return lo <= point && (temp[point2] >= temp[lo] || hi < point2);
}

public static void merge(int[] data, int[] temp, int lo, int point, int point2, int hi){
  for(int i = lo; i <= hi; i++){
    if(lo <= point && (temp[point2] >= temp[lo] || hi < point2)){
      data[i] = temp[lo];
      lo++;
    }
    else{
      System.out.println(i +" , " +point2);
      data[i] = temp[point2];
      point2++;
    }
  }
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
  int[] data = new int[] {3,3,1,1,2,2};
  int[] data2 = new int[] {2,6,8,9,3,5,12,13,10,7};
  System.out.println(printArray(data2));
  Mergesort(data2);
  System.out.println(printArray(data2));

}



}
