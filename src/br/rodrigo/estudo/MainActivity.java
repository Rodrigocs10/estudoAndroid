package br.rodrigo.estudo;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String MENSAGEM = "br.rodrigo.estudo.Mensagem";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch(id){
			case R.id.action_buscar:{
				Intent intent = new Intent(this, ActivityBuscar.class);
				startActivity(intent);
			}
			default:{
				return super.onOptionsItemSelected(item);
			}
		}
		
	}
	
	public void sendMessage(View view){
		EditText editText = (EditText) findViewById(R.id.edit_text);
		String texto = editText.getText().toString();
		
		Intent intent = new Intent(this, DisplayMessage.class);
		intent.putExtra(MENSAGEM, texto);
		
		startActivity(intent);
		
	}
	
}
