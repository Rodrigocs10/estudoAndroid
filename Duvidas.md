# Dúvidas

###*18/10/14*
>Como Mudar o tema da aplicação. Quando mudo apenas no manifest a aplicação para com o seguinte erro:
 java.lang.RuntimeException: Unable to start activity ComponentInfo{br.rodrigo.estudo/br.rodrigo.estudo.MainActivity}: java.lang.IllegalStateException: You need to use a Theme.AppCompat theme (or descendant) with this activity.

**Reposta**
>Ao invés da nossa activity herdar de ActionBarActivity, devemos fazer ela herdar de Activity
**Drawback**
> Funcionalidade de adicionar botão de voltar para o parente facilmente não pode ser usada
> Funcionalidade de action buttons da action bar tabém não funciona. O botão não parece quando settamos a propriedade android:showAsAction do item
**Solução?**
*Ainda não foi solucionado*

###*20/10/14*
>Quando não uso onSaveInstanceState(Bundle savedInstanceState) para salvar um inteiro, quando viro a tela o estado não é salvo. Mas quando mudo para outra aplicação é salvo. Por que?




