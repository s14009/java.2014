class Ex3{

	public String ex3_0(int n){

        if(n>0){
            return "その値は正です";
        }else{
            return "その値は０か負です";
        }
	}

	public int ex3_1(int n){

        int a = Math.abs(n);
            return a;
	}

	public String ex3_2(int a, int b){

        if((a % b)==0){
            return b+"は"+a+"の約数です";
        }else{
            return b+"は"+a+"の約数ではありません";
        }
    }

	public String ex3_3(int a, int b){

        if(a>b){
            return a+"の方が大きいです";
        }else if(a==b){
            return "同じ値です";
        }else{
            return b+"の方が大きいです";
        }
	}

	public String ex3_4(int a){

        if(a % 5 ==0 && a > 0){
            return "その値は5で割り切れます";
        }else if(a % 5 >0){
            return "その値は5で割り切れません";
        }else{
            return "正でない整数値です";
        }
	}

	public String ex3_5(int a){
        
         if(a % 10 ==0 && a > 0){
            return "その値は10の倍数です";
        }else if(a % 10 >0){
            return "その値は10の倍数ではありません";
        }else{
            return "正でない整数値です";
        }
       
	}
	
	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
 
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}
}
