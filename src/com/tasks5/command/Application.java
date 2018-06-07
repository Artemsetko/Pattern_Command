package com.tasks5.command;

public class Application {
    public static void main(String[] args) {
        //YOUR CODE COMES HERE
        Document d = new Document();
        if (args == null || args.length == 0) {
            System.out.println("Error");
        } else if (args[0].equals("help")) {
            new HelpCommand(d).execute();
        } else if (args.length == 2 && args[0].equals("echo")) {
            new EchoCommand(d, args[1]).execute();
        } else if (args[0].equals("date") && args[1].equals("now")) {
            new DateCommand(d).execute();
        } else if (args.length == 1 && args[0].equals("exit")) {
            new ExitCommand(d).execute();
        } else {
            System.out.println("Error");
        }
    }

    static class DateCommand implements Command {
        Document doc;

        public DateCommand(Document doc) {
            this.doc = doc;
        }

        @Override
        public void execute() {
            doc.dateNow();
        }
    }

    //Receiver
    static class Document {
        void help() {
            System.out.println("Help executed");
        }

        void echo(String txt) {
            System.out.println(txt);
        }

        void dateNow() {
            System.out.println(System.currentTimeMillis());
        }

        void exit() {
            System.out.println("Goodbye!");
        }
    }

    static class EchoCommand implements Command {
        Document doc;
        String text;

        public EchoCommand(Document doc, String text) {
            this.doc = doc;
            this.text = text;
        }

        @Override
        public void execute() {
            doc.echo(text);
        }
    }

    static class ExitCommand implements Command {
        Document doc;

        public ExitCommand(Document doc) {
            this.doc = doc;
        }

        @Override
        public void execute() {
            doc.exit();
        }
    }

    //ConcreteCommand
    static class HelpCommand implements Command {
        Document doc;

        public HelpCommand(Document doc) {
            this.doc = doc;
        }

        @Override
        public void execute() {
            doc.help();
        }
    }


}

