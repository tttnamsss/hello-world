public class zX9f_tacoCat {

public static void main(String[] args){
int[] omgWut = {9,3,5,1,8};
sorterz(omgWut);
for(int t : omgWut)
System.out.print(t + " ");
}

public static void sorterz(int[] wow){
for(int a = 0; a < wow.length; a++){
for(int b = 0; b <= wow.length; b++){
if(wow[a] < wow[b]){
int temp = wow[a];
wow[a] = wow[b];
wow[b] = temp;
}
}
}
}
}
