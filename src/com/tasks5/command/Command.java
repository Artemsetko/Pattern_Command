package com.tasks5.command;

////Invoker
//
//class User {
//    Command help;
//    Command echo;
//    Command dateNow;
//    Command exit;
//
//    public User(Command help, Command echo, Command dateNow, Command exit) {
//        this.help = help;
//        this.echo = echo;
//        this.dateNow = dateNow;
//        this.exit = exit;
//    }
//
//    void help() {
//        help.execute();
//    }
//
//    void echo() {
//
//    }
//
//}
interface Command {
    public void execute();
}
