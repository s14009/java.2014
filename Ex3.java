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
        if(a % 3 ==0 && a > 0){
            return "その値は3で割り切れます";
        }else if(a % 3 ==1){
            return "その値を3で割った余りは1です";
        }else if(a % 3 ==2){
            return "その値を3で割った余りは2です";
        }else{
            return "正でない整数値です";
        }
    }

	public String ex3_7(int a){

        if(0 <= a && a <= 59){
            return "不可";
        }else if(60 <= a && a <= 69){
            return "可";
        }else if(70 <= a && a <= 79){
            return "良";
        }else if(80 <= a && a <= 100){
            return "優";
        }else{
            return "範囲(0～100)外の値です";
        }
	}

	public double ex3_8(double a, double b){
		if(a < b){
            return b;
        }else{
            return a;
        }
	}

	public int ex3_9(int a, int b){

        int c = a - b;
            return c;
    }

	public String ex3_10(int a, int b){

        int c = Math.abs(a - b);

        if(0 <= c && c < 11){
            return "それらの差は10以下です";
        }else{
            return "それらの差は11以上です";
        }
    }

/*	public int ex3_11(int a, int b, int c){
		return 1000;
	}

	public int ex3_12(int a, int b, int c){
		return 1000;
	}

	public String ex3_13(int a){
		return "dummy";
	} */
}
