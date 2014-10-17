# Dúvidas

>Como Mudar o tema da aplicação. Quando mudo apenas no manifest a aplicação para com o seguinte erro:
 java.lang.RuntimeException: Unable to start activity ComponentInfo{br.rodrigo.estudo/br.rodrigo.estudo.MainActivity}: java.lang.IllegalStateException: You need to use a Theme.AppCompat theme (or descendant) with this activity.

**Reposta**
>Ao invés da nossa activity herdar de ActionBarActivity, devemos fazer ela herdar de Activity
**Drawback**
> Funcionalidade de adicionar botão de voltar para o parente facilmente não pode ser usada
***Solução?*
