import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean te = false;
        if(languages.size() == 0)
        {
            te = true;
        }  
        return te;

    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        boolean hadI = languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get (0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        boolean cont = false;
    for (int i = 0; i<languages.size();  i++)
        {
            if (language == languages.get(i))
            {
                cont = true;
            }
        }
        
        return cont;
    }
    

    public boolean isExciting() {
        boolean ex = false;
        for (int i = 0; i<languages.size();  i++)
        {
            if ("Java".equalsIgnoreCase(languages.get(i)) || ("Kotlin".equalsIgnoreCase(languages.get(i))))
            {
                ex = true;
            }
        }
        return ex;
    }
}
