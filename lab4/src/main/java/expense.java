public class expense {
    private int money;

    public expense(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void addMoney(int money){
        this.money += money;
    }
    public int takeOutMoney(int money){
        if(this.money>=money){
            this.money-=money;
            return money;
        }
        else{
            System.out.println("not enough money");
            return 0;
        }

    }
}
