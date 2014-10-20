package br.rodrigo.estudo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessage extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		
		Intent intent = getIntent();
		String text = intent.getStringExtra(MainActivity.MENSAGEM);
		
		TextView textView = new TextView(this);
		textView.setText(text + ", current level: " + getmCurrentLevel() + 
				"Currente score: " + getmCurrentScore());
				
		// Check whether we're recreating a previously destroyed instance
				if (savedInstanceState != null) {
					// Restore value of members from saved state
					setmCurrentLevel(savedInstanceState.getInt(STATE_LEVEL));
					setmCurrentScore(savedInstanceState.getInt(STATE_SCORE));
					 
				} else {
					// Probably initialize members with default values for a new
					// instance
				}
				
		setContentView(textView);
		
		// Quando a Acitivity que criamos extende Activity(necessário para criar thema customziado) 
		// ao invés de ActionBarActivity não podemos usar getSupportActionBar()
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
	
	public void onRestart(){
		super.onRestart();
		setmCurrentLevel(getmCurrentLevel() + 1);
		setmCurrentScore(getmCurrentScore() + 1);
	}
	public void onSaveInstanceState(Bundle savedInstanceState) {
		savedInstanceState.putInt(STATE_SCORE, 1);
		savedInstanceState.putInt(STATE_LEVEL, 2);

		// Always call the superclass so it can save the view hierarchy state
		super.onSaveInstanceState(savedInstanceState);
	}

}
