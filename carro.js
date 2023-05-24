const templateCard = document.getElementById('template-card').content
const cards = document.getElementById('cards')
const fragment = document.createDocumentFragment()
fetch('api.json', {

})
  .then(response => response.json())
  .then(data => pintarCard(data))


const pintarCard = data =>{
    data.forEach(producto => {
    templateCard.querySelector('h5').textContent = producto.title
    templateCard.querySelector('p').textContent = producto.precio
    templateCard.querySelector('img').setAttribute('src', producto.thumbnailUrl)
console.log(producto);

const clone = templateCard.cloneNode(true)
fragment.appendChild(clone)

    });
    cards.appendChild(fragment)
}


