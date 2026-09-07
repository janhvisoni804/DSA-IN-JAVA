public class Stock_buy_and_sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int min_buy=arr[0];
        int buy=-1,sell=-1;
        int cost=0,profit=0;
        for(int i=0;i<arr.length;i++){
            cost=arr[i]-min_buy;
            if(cost>profit){
                profit=cost;
                sell=arr[i];
            }
            min_buy=Math.min(min_buy, arr[i]);
            buy=min_buy;
        }
        System.out.println("profit is "+profit);
        System.out.println("buy on "+buy+" and sell on "+sell);
    }
}
