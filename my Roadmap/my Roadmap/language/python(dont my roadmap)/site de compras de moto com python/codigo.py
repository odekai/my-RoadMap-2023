from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('home_page.html')

if __name__ == '__main__':
    app.run(debug=True)
@app.route('home_page.html')
def index():
    # Aqui você pode adicionar qualquer lógica necessária para buscar dados do banco de dados
    # Neste exemplo, estamos apenas passando uma lista de tarefas fictícia para o template
    tasks = [
        {'id': 1, 'description': 'Fazer compras'},
        {'id': 2, 'description': 'Estudar Flask'},
        {'id': 3, 'description': 'Ir ao médico'}
    ]
    return render_template('home_page.html', tasks=tasks)

    