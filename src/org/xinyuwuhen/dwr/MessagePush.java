package org.xinyuwuhen.dwr;

import org.directwebremoting.Browser;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;

import java.util.Collection;
import java.util.Date;

/**
 * Created by xinyuwuhen on 8/25/15.
 */
public class MessagePush {

    /*public void send(){

        Runnable run = new Runnable(){
            private ScriptBuffer script = new ScriptBuffer();
            public void run() {
                String content = "Date : " + new Date();
                //设置要调用的 js及参数
                script.appendCall("show" , content);
                //得到所有ScriptSession
                Collection<ScriptSession> sessions = Browser.getTargetSessions();
                //遍历每一个ScriptSession
                for (ScriptSession scriptSession : sessions){
                    scriptSession.addScript( script);
                }
            }
        };
        //执行推送
        Browser. withAllSessions(run);
    }*/

    public void send(String msg){
        Runnable run = new Runnable(){
            private ScriptBuffer script = new ScriptBuffer();
            public void run() {
                String content = "Date : " + new Date();
                //设置要调用的 js及参数
                script.appendCall("show" , content);
                //得到所有ScriptSession
                Collection<ScriptSession> sessions = Browser.getTargetSessions();
                //遍历每一个ScriptSession
                for (ScriptSession scriptSession : sessions){
                    scriptSession.addScript( script);
                }
            }
        };
        //执行推送
        Browser. withAllSessions(run);
    }


}
