public class Game {
    Game(String job,double hp,double att,double MP){
        this.job=job;
        this.hp=hp;
        this.att=att;
        this.MP=MP;}

    String job;//職位
    double hp,att,MP;//生命，攻擊上限，護甲

    public void attack(Game other){
        double hurt = Math.random()*(att);
        if(hurt<=other.MP)
        else {
            hurt = hurt - other.MP;;
        }
        other.hp-=hurt;

        System.out.println(job+"對"+other.job+"造成了"+hurt+"點傷害");
        System.out.println(" ");
        System.out.println(job+"當前血量為:"+hp);
        System.out.println(other.job+"當前血量為:"+other.hp);
        System.out.println(" ");
    }

    public boolean live(Game other){
        if(hp<=0) {
            System.out.println(job+"已死亡    "+other.job+"獲得勝利");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {Game p1=new Game("弓箭手",15,30,10);
        Game p2=new Game("fighter狂戰士",20,15,5);
        Game p3=new Game("wizzard魔法師",10,40,30);
        while(true)
       {
            p1.attack(p2);
            if(!p2.live(p1)){
                break;
            }
            p2.attack(p1);
            if(!p1.live(p2)){
                break;
            }
            p3.attack(p1);
            if(!p1.live(p3)){
                break;
            }
        }
    }
}
