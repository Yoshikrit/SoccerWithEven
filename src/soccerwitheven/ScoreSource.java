/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerwitheven;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class ScoreSource {
    private ArrayList<ScoreListener> listeners;
    public ScoreSource() {
	listeners = new ArrayList<>();
    }
    public void setSourceLine(String val) {
	fireSoccerHeadQuarter(new ScoreEvent(this, val));
    }
    public void register(ScoreListener l) {
	listeners.add(l);
    }
    public void remove(ScoreListener l) {
	listeners.remove(l);
    }
    public void fireSoccerHeadQuarter(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.scoreChange(e);
	}
    }
}
