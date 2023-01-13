package test;

import core.WindowManager;
import org.lwjgl.Version;

public class Launch {
    public static void main(String [] args){
        System.out.println(Version.getVersion());
        WindowManager window = new WindowManager("DOWNEY ENGINE", 0, 0, false);
        window.init();

        while(!window.windowShouldClose()){
            window.update();
        }

        window.cleanup();
    }

}
