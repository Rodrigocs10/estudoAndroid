package br.rodrigo.estudo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessage extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		
		Intent intent = getIntent();
		String text = intent.getStringExtra(MainActivity.MENSAGEM);
		
		TextView textView = new TextView(this);
		textView.setText(text);
		
		setContentView(textView);
		
	}

}
