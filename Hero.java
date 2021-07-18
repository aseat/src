
public class Hero {
  String name;
  int hp;
  Sword sword;
  // void attack() {}
  void run() {
    System.out.println(this.name + "は、この世から逃げた");
    System.out.println("人生終了お疲れ様でーす");
    System.out.println("最終HPは" + this.hp + "でした");
  }
  void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は眠って回復したお");
    System.out.println("HPが"+ sec + "ポイント回復したお");
  }
  void slip() {
    this.hp -=5;
    System.out.println(this.name + "は、転んじまった");
    System.out.println("5のダメージ");
  }
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復したお");
  }
  Hero(){
    this.hp=100;
  }
} 