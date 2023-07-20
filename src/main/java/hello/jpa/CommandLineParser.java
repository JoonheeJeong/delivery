package hello.jpa;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CommandLineParser {

    public Map<String, Object> parse(String commandLine) {
        StringTokenizer st = new StringTokenizer(commandLine);
        Map<String, Object> commandModel = new HashMap<>();
        String cmd = st.nextToken();
        String domain = st.nextToken();
        String[] args = getArgs(st);
        commandModel.put("domain", domain);
        commandModel.put("cmd", cmd);
        commandModel.put("args", args);
        return commandModel;
    }

    private String[] getArgs(StringTokenizer st) {
        int sizeArgs = st.countTokens();
        String[] args = new String[sizeArgs];
        for (int i = 0; i < sizeArgs; ++i)
            args[i] = st.nextToken();
        return args;
    }
}
