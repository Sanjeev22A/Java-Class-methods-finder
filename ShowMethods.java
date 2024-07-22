import java.util.regex.*;
import java.lang.reflect.*;

public class ShowMethods {
    private static final String usage=
    "usage : \n"+
    "ShowMethods qualified.class.name \n"+
    "To Show all the Methods in a class or :\n"+
    "ShowMethods qualified.class.name word\n"+
    "To search for methids involving 'word'";
    private static Pattern p=Pattern.compile("\\w+\\\\");
    public static void main(String[] args){
        if(args.length<1){
            System.out.println(usage);
            System.exit(0);
        }
        
        int lines=0;
        try{
            Class<?> c=Class.forName(args[0]);
            Method[] m=c.getMethods();
            Constructor<?>[] ctor=c.getConstructors();
            if(args.length==1){
                for(int i=0;i<m.length;i++){
                    System.out.println(p.matcher(m[i].toString()).replaceAll(""));
                    System.out.println(m[i].toString());

                }
                for(int i=0;i<ctor.length;i++){
                    System.out.println(p.matcher(ctor[i].toString()).replaceAll(""));
                }
                lines=m.length+ctor.length;
            }
            else{
                for(int i=0;i<m.length;i++){
                    if(m[i].toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(m[i].toString()).replaceAll(""));
                        lines++;
                    }

                    
                }
                for(int i=0;i<ctor.length;i++){
                    if(ctor[i].toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(ctor[i].toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        }
        catch(ClassNotFoundException e){
            System.out.println("Invalid class name");
            System.exit(0);
        }
        catch(NoClassDefFoundError e){
            System.out.println("No class found : "+e);
            System.exit(0);
        }
    }

}
