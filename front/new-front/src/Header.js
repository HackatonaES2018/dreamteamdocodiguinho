import React from 'react';

export default class Header extends React.Component {
    render() {
        return (
            <header className="main-header">
                <a href="/" className="portocred">Portocred</a>
                <button className="toggle ">Abre / fecha menu</button>
                <nav className="main-nav">
                    <ul className="main-menu">
                        <li>
                            <button className="menu-button">Para você</button>
                            <ul className="layer-menu">
                                <li>
                                    Crédito pessoal
                                </li>
                                <li>
                                    Consignado privado
                                </li>
                                <li>
                                    Consignado público
                                </li>
                                <li>
                                    Investimentos
                                </li>
                            </ul>
                        </li>
                        <li>
                            <button className="menu-button">Para parceiros</button>
                            <ul className="layer-menu">
                                <li>
                                    Correspondente
                                </li>
                                <li>
                                    Parceirias corporativa
                                </li>
                                <li>
                                    Empregadore
                                </li>
                            </ul>
                        </li>
                        <li>
                            <button className="menu-button">Para Institucional</button>
                            <ul className="layer-menu">
                                <li>
                                    Sobre a Portocred
                                </li>
                                <li>
                                    Trabalhe conosco
                                </li>
                                <li>
                                    Canais de atendimento
                                </li>
                                <li>
                                    Informações importantes
                                </li>
                                <li>
                                    Lojas e correspondentes
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form action="/" novalidate="">
                        <button className="search " type="button">Busca</button>
                        <div className="form-item box-search">
                            <div className="input-button">
                                <div className="text-autocomplete">
                                    <div style={{display: 'inline-block'}}>
                                        <input name="search-text" value="" id="search-text" className="input input-text -highlight -withbutton"
                                            maxlength="150" placeholder="Busca" role="combobox" aria-autocomplete="list" aria-expanded="false"
                                            autocomplete="off" type="search" />
                                    </div>
                                </div>
                                <button className="overbutton -search" type="submit">Buscar</button>
                            </div>
                        </div>
                    </form>
                    <div className="restricted-menu">
                        <button className="button">Área do cliente</button>
                        <ul className="layer-menu -restricted">
                            <li>
                                Demonstrativo de quitação
                            </li>
                            <li>
                                Extrato de despesas
                            </li>
                            <li>
                                2ª via de carnê
                            </li>
                            <li>
                                Boletos de negociação
                            </li>
                            <li>
                                Parcelas em aberto
                            </li>
                            <li>
                                Acesso ao captação web
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
        );
    }
}