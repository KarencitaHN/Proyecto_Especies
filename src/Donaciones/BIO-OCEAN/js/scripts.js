// ========================
// CARRUSEL AUTOMÁTICO
// ========================

let currentSlide = 0;
const slides = document.querySelectorAll('.carrusel-img');

function showSlide(index) {
  slides.forEach((slide, i) => {
    slide.classList.remove('active');
    if (i === index) {
      slide.classList.add('active');
    }
  });
}

function nextSlide() {
  currentSlide = (currentSlide + 1) % slides.length;
  showSlide(currentSlide);
}

// Cambia cada 4 segundos
setInterval(nextSlide, 4000);

// ========================
// FORMULARIO DONACIÓN
// ========================

function mostrarFormulario() {
  const metodo = document.getElementById('metodoPago').value;
  const paypalForm = document.getElementById('formularioPaypal');
  const tarjetaForm = document.getElementById('formularioTarjeta');

  paypalForm.style.display = metodo === 'paypal' ? 'block' : 'none';
  tarjetaForm.style.display = metodo === 'tarjeta' ? 'block' : 'none';
}