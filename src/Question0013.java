import java.util.HashMap;

class Question0013 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> numbers = new HashMap<>();
        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);

        char[] strArr =s.toCharArray();
        int num = 0;
        for(int i = 0; i < strArr.length-1; i++){
            if(numbers.get(strArr[i]) < numbers.get(strArr[i+1])){
                num-= numbers.get(strArr[i]);
            }else{
                num+= numbers.get(strArr[i]);
            }
        }
        num+= numbers.get(strArr[strArr.length-1]);
        return num;
    }
}