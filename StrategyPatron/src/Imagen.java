
    class Imagen {
        private Filtros filtro;

        public void setFiltro(Filtros filtro) {
            this.filtro = filtro;
        }

        public void Editar(String nombreImagen){
            filtro.aplicarFiltros(nombreImagen);
        }
    }

