import java.util.LinkedList;

class Main
{
    public static void main(String[] args) 
    {

        String path = "";
        String prefix = "";
        LinkedList<String> listFiles = new LinkedList<>();

        for(int i = 0; i < args.length; ++i)
        {
            switch (args[i]) {
                case "-o":
                    path = args[i+1];
                    ++i;
                    break;

                case "-p":
                    prefix = args[i+1];
                    ++i;
                    break;

                default:
                    listFiles.add(args[i]);
                    break;
            }
        }

        System.out.println(path);
        System.out.println(prefix);
        for(String fileName : listFiles)
        {
            System.out.println(fileName);
        }
    }
}