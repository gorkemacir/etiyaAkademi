public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManager = new BaseKrediManager[]
                {new ogretmenKrediManager(),new tarımKrediManager()}
        for(BaseKrediManager krediManager:krediManager)
    }
}