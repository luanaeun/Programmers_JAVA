import java.util.*;

class x만큼간격있는_n개숫자 {

	public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++)
            answer[i]=x*(i+1);
        return answer;
    }

}




