package com.sample;
import com.yicai.dao.*;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.kie.api.runtime.rule.Variable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {

        try {
            // load up the knowledge base

	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");


            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            ArrayList<CPIData> CPIDataFact = new ArrayList<>();
          
        	//CPIData CPIDataFact1 = new CPIData(101.6, 102.7, 103.6, 102.9, 101.0,101.9,98.2,101.7,100.8,7,"同比");
            CPIDataFact.add(new CPIData(101.5, 102.7, 99.5, 102.9, 101.1,101.8,98.4,101.6,100.6,4,"同比"));
            CPIDataFact.add(new CPIData(101.2, 101.6, 101.7, 102.8, 101.0,101.8,98.7,101.7,100.7,5,"同比"));
            CPIDataFact.add(new CPIData(101.4, 101.9, 103.5, 102.9, 101.0,101.9,98.5,101.7,100.8,6,"同比"));
        	CPIDataFact.add(new CPIData(101.6, 102.7, 103.6, 102.9, 101.0,101.9,98.2,101.7,100.8,7,"同比"));
        	
        	
        	
        	CPIData CPIDataFact2 = new CPIData(100.3, 100.7, 100.1, 99.5, 100.0, 100.1, 100.0, 100.8, 100.1, 7, "环比");
        	PPIData PPIDataFact1 = new PPIData(94.6, 93.1, 99.7, 7, "同比");
        	PPIData PPIDataFact2 = new PPIData(99.3, 99.1, 100, 7, "环比");
      
            //kSession.insert(message);
        	for(int index =0; index < CPIDataFact.size();index++){
        		kSession.insert(CPIDataFact.get(index));
        	}
            kSession.insert(CPIDataFact2);
            kSession.insert(PPIDataFact1);
            kSession.insert(PPIDataFact2);
        	/*QueryResults results = kSession.getQueryResults("index over the threshhold 101" );
        	System.out.println("We have " + results.size() + "食物类CPI超过101");
        	QueryResults results = kSession.getQueryResults( "anyindex", new Object[] { Variable.v } );
        	ArrayList<String> l = new ArrayList< >();
        	for ( QueryResultsRow r : results ) { 
        		System.out.println(r.toString());
        		System.out.println("%%%%%%%%%%%%%%%%%%%%%/n");
        	}*/
        			       	
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
