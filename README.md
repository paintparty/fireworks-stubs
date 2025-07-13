# fireworks-stubs

The production version of [Fireworks](https://github.com/paintparty/fireworks), a themeable print debugging library for Clojure, ClojureScript, and Babashka.

<br>

Use this version in production builds. It has the same api as Fireworks, but there is zero runtime cost, as all of the macros just expand to return the form itself (no printing).

<br>

## Usage
```Clojure
[io.github.paintparty/fireworks-stubs "0.12.6]
```

<br>

## License

Copyright © 2024-2025 Jeremiah Coyle

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
