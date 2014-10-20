package br.rodrigo.estudo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessage extends MainActivity {

	
	private TextView textView ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		
		Intent intent = getIntent();
		String text = intent.getStringExtra(MainActivity.MENSAGEM);
		
		textView = new TextView(this);
		
				
		// Check whether we're recreating a previously destroyed instance
				if (savedInstanceState != null) {
					// Restore value of members from saved state
					setCountOnResume(savedInstanceState.getInt(COUNT_RESUME));
					setCountOnRestart(savedInstanceState.getInt(COUNT_RESTART));
					
					 
				} else {
					// Probably initialize members with default values for a new
					// instance
				}
				
		setContentView(textView);
		
		// Quando a Acitivity que criamos extende Activity(necessário para criar thema customziado) 
		// ao invés de ActionBarActivity não podemos usar getSupportActionBar()
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//setmCurrentLevel(getmCurrentLevel() + 1)
		
	}

	//setmCurrentLevel(getmCurrentLevel() + 1)
	public void onRestart(){
		super.onRestart();
		setCountOnRestart(getCountOnRestart() + 1);		
	}
	
	public void onResume(){
		super.onResume();
		setCountOnResume(getCountOnResume() + 1);
		atualizaTexto(getCountOnResume(), getCountOnRestart());
	}
	
	private void atualizaTexto(int countResume, int countRestart){
		textView.setText("count Resume: " + countResume + 
				"count restart: " + countRestart);
	}
	
	public void onSaveInstanceState(Bundle savedInstanceState) {
		savedInstanceState.putInt(COUNT_RESTART, getCountOnRestart());
		savedInstanceState.putInt(COUNT_RESUME, getCountOnResume());

		// Always call the superclass so it can save the view hierarchy state
		super.onSaveInstanceState(savedInstanceState);
	}

}
