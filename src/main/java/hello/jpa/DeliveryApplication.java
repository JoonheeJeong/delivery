package hello.jpa;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

@Slf4j
public class DeliveryApplication {

    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
    private static final CommandLineParser parser = new CommandLineParser();
    private static final CommandHandler commandHandler = new CommandHandler();

    public static void main(String[] args) throws IOException {
        log.info("Hello, world!");

        // object: member, addr, delivery

        // command format:
        // cmd domain args

        // command examples:
        // new member id name si_do si_gun_gu road detail
        // find member id
        // new delivery ...
        // find delivery id

        while (true) {
            String commandLine = readCommandLine();
            Map<String, Object> commandModel = parser.parse(commandLine);
            commandHandler.handlerCommand(commandModel);
        }
    }

    private static String readCommandLine() throws IOException {
        System.out.print("input command: ");
        return IN.readLine();
    }
}
