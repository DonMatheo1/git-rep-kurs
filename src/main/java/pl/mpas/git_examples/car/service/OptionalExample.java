package pl.mpas.git_examples.car.service;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {
    static Optional<String> getFriendsNick(){
        //return Optional.of("fuhrer");
        return  Optional.ofNullable(null);
    }


    public static void main(String[] args) {
        System.out.println(getFriendsNick());
        if(getFriendsNick().isPresent()){
            String nick=getFriendsNick().get();
        }

        Optional<String> maybeNick=getFriendsNick();
        maybeNick.ifPresent(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println("Nick: "+s);
            }


        });
        maybeNick.ifPresent((String s) ->{
            System.out.println("Nick: "+s);
        });
    }

}
