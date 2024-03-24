

```java
class Computer{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }
    public String playMusicforMoney(float money)
    {
        return "Playing Music... for Rs "+money ;
    }
}

public class Demo
{
    public static void main(String a[])
    {
        Computer comp=new Computer();
        comp.playMusic();
        // Playing Music...
        System.out.println(comp.playMusicforMoney(12));
        // Playing Music... for Rs 12.0
    }
}



```