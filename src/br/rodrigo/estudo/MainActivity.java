package br.rodrigo.estudo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	public static final String MENSAGEM = "br.rodrigo.estudo.Mensagem";

	// Valores usados para testar salvamento de status via onSaveInstanceState
	static final String STATE_SCORE = "playerScore";
	static final String STATE_LEVEL = "playerLevel";

	private int mCurrentScore;
	private int mCurrentLevel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mCurrentLevel++;
		mCurrentScore++;
		
		

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
		switch (id) {
		case R.id.action_buscar: {
			Intent intent = new Intent(this, ActivityBuscar.class);
			startActivity(intent);
		}
		default: {
			return super.onOptionsItemSelected(item);
		}
		}

	}

	public void sendMessage(View view) {
		EditText editText = (EditText) findViewById(R.id.edit_text);
		String texto = editText.getText().toString();

		Intent intent = new Intent(this, DisplayMessage.class);
		intent.putExtra(MENSAGEM, texto);

		startActivity(intent);

	}

	

	
	protected int getmCurrentScore() {
		return mCurrentScore;
	}

	protected void setmCurrentScore(int mCurrentScore) {
		this.mCurrentScore = mCurrentScore;
	}

	protected int getmCurrentLevel() {
		return mCurrentLevel;
	}

	protected void setmCurrentLevel(int mCurrentLevel) {
		this.mCurrentLevel = mCurrentLevel;
	}

}
